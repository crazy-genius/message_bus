package main.kotlin.info.crazylab.message_bus

interface MessageHandler<M: Message> {
    fun handle(message: M)
    fun canHandle(message: M): Boolean
}