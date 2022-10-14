package molchanov.hammertesttask.viewmodel

import com.gb.weather.domain.MenuItem
import molchanov.hammertesttask.model.dto.MenuDTO

sealed class MenuListAppState {
    data class Succes(val menuListDTO: List<MenuItem>): MenuListAppState()
    data class Error(val error:Exception): MenuListAppState()
    object Loading: MenuListAppState()
}