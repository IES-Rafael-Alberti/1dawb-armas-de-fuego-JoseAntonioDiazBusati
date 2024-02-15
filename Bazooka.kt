class Bazooka(
    municion:Int,
    tipoDeMunicion:String,
    override val danio: Int,
    override val radio: Radio
    ):ArmaDeFuego("Bazooka", municion,3,tipoDeMunicion) {
    init {
        require(radio == Radio.INTERMEDIO|| radio == Radio.AMPLIO || radio == Radio.ENORME  ){"Error radio"}

    }
}