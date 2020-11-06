import java.util.*

class jsondata : ArrayList<jsondataItem>()

data class jsondataItem(
        val created_at: String,
        val customer: Customer,
        val items: List<Item>,
        val order_id: String
)

data class Customer(
        val id: Int,
        val name: String
)

data class Item(
        val id: Int,
        val name: String,
        val price: Int,
        val qty: Int
)