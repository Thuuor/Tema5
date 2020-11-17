package exemples

import classes.Comarca
import classes.SessionFactoryUtil

fun main(){
	val sF = SessionFactoryUtil.sessionFactory
	val sessio = sF.openSession()
	val com = sessio.load("classes.Comarca","Alt Maestrat") as Comarca
	print("La comarca " + com.nomC) 
	print(" (província de " + com.provincia + ") ")
	println("té " + com.poblacios?.size + " pobles")
	for(p in com.poblacios!!){
		println(p.nom + " (" + p.instituts?.size + ") ")
	}
	sessio.close()
}

