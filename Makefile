# Ce Makefile permet de compiler le test de l'ihm en ligne de commande.
# Le but est d'illustrer les notions de "classpath", a vous de l'adapter
# a votre projet.
#
# Organisation:
#  1) Les sources (*.java) se trouvent dans le repertoire src
#     Les classes d'un package toto sont dans src/toto
#     Les classes du package par defaut sont dans src
#
#  2) Les bytecodes (*.class) se trouvent dans le repertoire build
#     La hierarchie des sources (par package) est conservee.
#
# Compilation:
#  Options de javac:
#   -d : repertoire dans lequel sont places les .class compiles
#   -classpath : repertoire dans lequel sont cherches les .class deja compiles
#   -sourcepath : repertoire dans lequel sont cherches les .java (dependances)

all: BinaireMult BinairePlus BinairePuissance Constante Env Evaluable ExpAbstraite ExpBinaire ExpressionEvaluable ExpUnaire TestAffichageInfixe TestEval UnaireCos UnaireExp UnaireSin Variable

BinaireMult:
	javac -d build -sourcepath src src/BinaireMult.java

BinairePlus:
	javac -d build -sourcepath src src/BinairePlus.java

BinairePuissance:
	javac -d build -sourcepath src src/BinairePuissance.java

Constante:
	javac -d build -sourcepath src src/Constante.java

Env:
	javac -d build -sourcepath src src/Env.java

Evaluable:
	javac -d build -sourcepath src src/Evaluable.java

ExpAbstraite:
	javac -d build -sourcepath src src/ExpAbstraite.java

ExpBinaire:
	javac -d build -sourcepath src src/ExpBinaire.java

ExpressionEvaluable:
	javac -d build -sourcepath src src/ExpressionEvaluable.java

ExpUnaire:
	javac -d build -sourcepath src src/ExpUnaire.java

TestAffichageInfixe:
	javac -d build -sourcepath src src/TestAffichageInfixe.java

TestEval:
	javac -d build -sourcepath src src/TestEval.java

UnaireCos:
	javac -d build -sourcepath src src/UnaireCos.java

UnaireExp:
	javac -d build -sourcepath src src/UnaireExp.java

UnaireSin:
	javac -d build -sourcepath src src/UnaireSin.java

Variable:
	javac -d build -sourcepath src src/Variable.java

# Execution:
# on peut taper directement la ligne de commande :
#   > java -classpath bin TestGUI
# ou bien lancer l'execution en passant par ce Makefile:
#   > make exeIHM

clean:
	rm -rf build/*.class
