val account : String = "admin"
val password : String = "123456"
var tmoney : Int = 80000
var ifuse : Boolean = true
var choice : String = "0"
fun main(){
    login()
    while (ifuse){
        myinterface()
        choice = readLine().toString()
        when(choice){
            "1" -> output()
            "2" -> input()
            "3" -> query()
            "4" -> exit()
            else -> print("输入错误，请重新输入：")
     }
    }
}
fun myinterface(){
    println("欢迎使用")
    println("1.取款")
    println("2.存款")
    println("3.查询余额")
    println("4.退出")
    print("请选择服务项目：")

}
fun login(){
    var judge : Boolean = true
    println("登录账户")
    while (judge) {
        print("账号：")
        val acc = readLine()
        print("密码：")
        val pwd = readLine()
          if (acc == account && pwd == password){
              judge = false
              println("登录成功，欢迎使用")
        }else println("账号或密码不正确，请重新输入")
    }
}
fun output(){
    print("取款金额：")
    var optmoney : Int? = readLine()?.toInt()
    if(optmoney != null) {
        if (optmoney <= tmoney) {
            tmoney = tmoney-optmoney
            println("取款成功，请取走您的现金")
        }else println("您的余额不足")
    }
}
fun input(){
    println("存款金额：")
    var iptmoney : Int? = readLine()?.toInt()
    if(iptmoney != null){
        tmoney = tmoney + iptmoney
        println("存款成功")
    }
}
fun query(){
    println("您的账户余额为${tmoney}元")
}
fun exit(){
ifuse = false
}