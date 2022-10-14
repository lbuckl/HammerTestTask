package molchanov.hammertesttask.model.request

import molchanov.hammertesttask.model.dto.MenuDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MenuRequestInterface {
    @GET("search")
    fun getMenu(
        @Query("q") q: String,
        @Query("description") description: String,
        @Query("keywords") keywords: String,
        @Query("media_type") media_type: String,
    ): Call<MenuDTO>
}