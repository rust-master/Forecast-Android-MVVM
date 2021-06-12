package co.zaryab.forecastandroidmvvm.data.network.response


import co.zaryab.forecastandroidmvvm.data.db.entity.CurrentWeatherEntry
import co.zaryab.forecastandroidmvvm.data.db.entity.Location
import co.zaryab.forecastandroidmvvm.data.db.entity.Request
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
        @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
        val location: Location,
        val request: Request
)