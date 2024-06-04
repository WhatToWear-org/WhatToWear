package wtw.wtw.components.core.store.stats

import javax.swing.text.html.HTML.Tag
import wtw.wtw.components.core.store.StoreOutfit

class Info {
    private var totalPurchases: Int = 0
    private var totalViews: Int = 0
    private var totalClicksOnViews: Int = 0
    private var totalAsFavourites: Int = 0

    private var mostFavouriteTag: Tag? = null
    private var leastFavouriteTag: Tag? = null

    private var favouriteProduct: StoreOutfit? = null

    fun getTotalPurchases(): Int {
        return totalPurchases
    }

    fun setTotalPurchases(totalPurchases: Int) {
        this.totalPurchases = totalPurchases
    }

    fun getTotalViews(): Int {
        return totalViews
    }

    fun setTotalViews(totalViews: Int) {
        this.totalViews = totalViews
    }

    fun getTotalClicksOnViews(): Int {
        return totalClicksOnViews
    }

    fun setTotalClicksOnViews(totalClicksOnViews: Int) {
        this.totalClicksOnViews = totalClicksOnViews
    }

    fun getTotalAsFavourites(): Int {
        return totalAsFavourites
    }

    fun setTotalAsFavourites(totalAsFavourites: Int) {
        this.totalAsFavourites = totalAsFavourites
    }

    fun getMostFavouriteTag(): Tag? {
        return mostFavouriteTag
    }

    fun setMostFavouriteTag(mostFavouriteTag: Tag) {
        this.mostFavouriteTag = mostFavouriteTag
    }

    fun getLeastFavouriteTag(): Tag? {
        return leastFavouriteTag
    }

    fun setLeastFavouriteTag(leastFavouriteTag: Tag) {
        this.leastFavouriteTag = leastFavouriteTag
    }

    fun getFavouriteProduct(): StoreOutfit? {
        return favouriteProduct
    }

    fun setFavouriteProduct(favouriteProduct: StoreOutfit) {
        this.favouriteProduct = favouriteProduct
    }
}
