package molchanov.hammertesttask.model.dto

data class Data(
    val album: List<String>,
    //Названеи
    val center: String,
    val date_created: String,
    val description: String,
    val keywords: List<String>,
    val location: String,
    val media_type: String,
    val nasa_id: String,
    val photographer: String,
    //описание
    val title: String
)