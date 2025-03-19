
fun main() {
    println("Заполните базу данных")
    input()
    println(users)
    authorization(users)
    }

val users = hashMapOf<String, String>()

fun input(): HashMap<String, String> {
    while (users.size < 2) {
        println("Заполните логин для ${users.size + 1} пользователя")
        val login = readln()
        println("Введите пароль ${users.size + 1} пользователя")
        val pass = readln()
        users[login] = pass
    }
    println("База данных заполнена")
    return users
}

fun authorization(users:HashMap<String,String>) {
    println("Авторизация пользователей: ")
    while (true) {
        println("Введите логин")
        val inputLog = readln()
        println("Введите пароль")
        val inputPas = readln()
        if (users.keys.contains(inputLog) && users[inputLog] == inputPas) {
            println("Добро пожаловать $inputLog")
        } else {
            println("Указан неверный логин или пароль")
            println("Повторите попытку")
            authorization(users)
        }
        return
    }
}


