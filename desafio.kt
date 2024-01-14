// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }
}

fun main() {
    // Simulando alguns cenários de teste
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 45)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 60)

    val formacao = Formacao("Desenvolvimento Kotlin", mutableListOf(conteudo1, conteudo2))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    // Verificando os inscritos
    println("Inscritos na formação ${formacao.nome}: ${formacao.inscritos.map { it.nome }}")
}
