enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

var matricula : Int = 0

class Usuario (val nomeAluno : String, val cpf : String, val matricula : String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        println("Matrícula realizada de ${usuario.nomeAluno} com o número ${usuario.matricula}, de CPF ${usuario.cpf}")
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    

    var marco = Usuario("marco", "00000000201", "00")
    var grazi = Usuario("grazi", "00000000202", "01")

    val conteudo1 = ConteudoEducacional("Fundamentos Básicos de Kotlin", 60)
    val conteudo2 = ConteudoEducacional("Desenvolvimento de um App em Kotlin", 60)
    val conteudos : List<ConteudoEducacional> = listOf(conteudo1, conteudo2)
    var conteudosEducacionais : List<ConteudoEducacional> = conteudos
    val formacaoAndroid = Formacao("Android Developer", conteudosEducacionais)
    
    for (i in formacaoAndroid.inscritos){
        formacaoAndroid.matricular(i)
    }
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}