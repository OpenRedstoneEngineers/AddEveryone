import com.google.common.eventbus.Subscribe
import com.plotsquared.core.PlotAPI
import com.plotsquared.core.database.DBFunc
import com.plotsquared.core.events.PlotClaimedNotifyEvent
import org.bukkit.plugin.java.JavaPlugin

class AddEveryone : JavaPlugin() {
    override fun onEnable() {
        super.onEnable()
        PlotAPI().registerListener(this)
    }

    @Subscribe
    fun onPlayerClaimPlot(event: PlotClaimedNotifyEvent) {
        event.plot.addMember(DBFunc.EVERYONE)
    }
}
