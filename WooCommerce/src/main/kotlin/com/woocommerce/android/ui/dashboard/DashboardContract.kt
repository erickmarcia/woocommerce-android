package com.woocommerce.android.ui.dashboard

import com.woocommerce.android.ui.base.BasePresenter
import com.woocommerce.android.ui.base.BaseView
import com.woocommerce.android.ui.dashboard.DashboardStatsView.StatsTimeframe
import org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity

interface DashboardContract {
    interface Presenter : BasePresenter<View> {
        fun loadStats(period: StatsTimeframe, forced: Boolean = false)
        fun getStatsCurrency(): String?
    }

    interface View : BaseView<Presenter> {
        var isActive: Boolean

        fun setLoadingIndicator(active: Boolean)
        fun showStats(revenueStats: Map<String, Double>, salesStats: Map<String, Int>, granularity: StatsGranularity)
    }
}
