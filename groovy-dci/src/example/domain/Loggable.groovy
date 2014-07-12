package example.domain

trait Loggable {
	def updateLog(msg) {
		println "[Audit] ${msg}" 
	}
}
