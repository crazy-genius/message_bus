package main.kotlin.info.crazylab.message_bus

interface Dispatcher<M: Message, H: MessageHandler<M>> {
    fun dispose()
    fun doDispatch(message: M)
    fun appendHandler(handler: H)
}