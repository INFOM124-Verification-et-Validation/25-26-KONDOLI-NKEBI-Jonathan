package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemUpdater updater = ItemUpdaterFactory.create(item);
            updater.update(item);
        }
    }

    // Interface pour la stratégie de mise à jour
    interface ItemUpdater {
        void update(Item item);
    }

    // Implémentations concrètes pour chaque type d'item
    class NormalItemUpdater implements ItemUpdater {
        @Override
        public void update(Item item) {
            decreaseQuality(item, 1);
            item.sellIn = item.sellIn - 1;

            if (item.sellIn < 0) {
                decreaseQuality(item, 1);
            }
        }
    }

    class AgedBrieUpdater implements ItemUpdater {
        @Override
        public void update(Item item) {
            increaseQuality(item, 1);
            item.sellIn = item.sellIn - 1;

            if (item.sellIn < 0) {
                increaseQuality(item, 1);
            }
        }
    }

    class BackstagePassUpdater implements ItemUpdater {
        @Override
        public void update(Item item) {
            increaseQuality(item, 1);

            if (item.sellIn < 11) {
                increaseQuality(item, 1);
            }

            if (item.sellIn < 6) {
                increaseQuality(item, 1);
            }

            item.sellIn = item.sellIn - 1;

            if (item.sellIn < 0) {
                item.quality = 0;
            }
        }
    }

    class SulfurasUpdater implements ItemUpdater {
        @Override
        public void update(Item item) {
            // Sulfuras ne change jamais
        }
    }

    // Factory pour créer les updaters appropriés
    class ItemUpdaterFactory {
        public static ItemUpdater create(Item item) {
            switch (item.name) {
                case "Aged Brie":
                    return new AgedBrieUpdater();
                case "Backstage passes to a TAFKAL80ETC concert":
                    return new BackstagePassUpdater();
                case "Sulfuras, Hand of Ragnaros":
                    return new SulfurasUpdater();
                default:
                    return new NormalItemUpdater();
            }
        }
    }

    // Méthodes utilitaires pour gérer la qualité
    class QualityHelper {
        public static void increaseQuality(Item item, int amount) {
            if (item.quality < 50) {
                item.quality = Math.min(50, item.quality + amount);
            }
        }

        public static void decreaseQuality(Item item, int amount) {
            if (item.quality > 0) {
                item.quality = Math.max(0, item.quality - amount);
            }
        }
    }
}
