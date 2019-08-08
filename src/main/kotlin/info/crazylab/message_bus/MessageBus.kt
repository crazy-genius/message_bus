package main.kotlin.info.crazylab.message_bus

import java.io.Closeable

abstract class MessageBus<M: Message, H: MessageHandler<M>>(private var dispatcher: Dispatcher<M, H>) : Closeable {

    fun dispatch(message: M) {
        dispatcher.doDispatch(message)
    }

    fun addHandler(handler: H) {
        dispatcher.appendHandler(handler)
    }

    override fun close() {
        dispatcher.dispose()
    }
}