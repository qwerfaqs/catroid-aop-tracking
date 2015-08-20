# Introduccion #

Esta guía se puede utilizar tanto como para crear un proyecto desde cero o para agregar AspectJ a un proyecto Android existente.

# Requisitos #
  * Eclipse IDE
  * AJDT: AspectJ Development Tools
  * Android SDK
  * ADT Plugin for Eclipse

# Detalles #
  * Agregar .jar AspectJ
    * Propiedades del proyecto
      * Java Build Path
        * Libraries
          * Add External JARS
  * Modificar .project
    * Agregar el buildCommand org.eclipse.ajdt.core.ajbuilder
    * Remover el buildCommand org.eclipse.jdt.core.javabuilder
    * Agregar el nature org.eclipse.ajdt.ui.ajnature en segundo lugar
  * Actualizar proyecto (F5)