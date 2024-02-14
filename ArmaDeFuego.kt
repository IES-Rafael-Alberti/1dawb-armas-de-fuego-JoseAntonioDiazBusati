import kotlin.random.Random
abstract class ArmaDeFuego(private val nombre: String,
                           private var municion: Int,
                           private val municionARestar: Int,
                           private val tipoDeMunicion: String) {
    abstract val radio:Radio
    abstract val danio:Int
    init {
        require(nombre.isNotBlank()){"El nombre no puede estar en blanco"}

    }
    companion object{
        var cantidadMunicionExtra = Random.nextInt(5,16)
        fun dispara(){}
        fun recarga(){}

    }
}