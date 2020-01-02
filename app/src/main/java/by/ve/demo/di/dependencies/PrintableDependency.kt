package by.ve.demo.di.dependencies


interface PrintableDependency {

    fun describe() = "- ${javaClass.simpleName}: ${hashCode()}"
}