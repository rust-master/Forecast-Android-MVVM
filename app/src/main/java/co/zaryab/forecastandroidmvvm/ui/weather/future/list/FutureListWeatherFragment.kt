package co.zaryab.forecastandroidmvvm.ui.weather.future.list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import co.zaryab.forecastandroidmvvm.R

class FutureListWeatherFragment : Fragment() {

    companion object {
        fun newInstance() = FutureListWeatherFragment()
    }

    private lateinit var viewModel: FutureListWeatherViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.future_list_weather_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FutureListWeatherViewModel::class.java)
        // TODO: Use the ViewModel
    }

}