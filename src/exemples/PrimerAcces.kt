package exemples

import org.hibernate.cfg.Configuration
import classes.Comarca

fun main() {
	val sf = Configuration().configure().buildSessionFactory()
	val sessio = sf.openSession()
	val com = sessio.load("classes.Comarca", "Alt Maestrat") as Comarca
	print("Comarca " + com.nomC + ": ")
	print(com.provincia)
	println(" (" + com.poblacios?.size + " pobles)")
	for(p in com.poblacios!!){
		println(p.nom + " (" + p.instituts?.size + ") ")
	}
	sessio.close()
}

