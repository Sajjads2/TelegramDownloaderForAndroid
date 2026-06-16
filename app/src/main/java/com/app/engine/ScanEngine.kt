package com.app.engine

class ScanEngine(private val td: TDClient) {

    fun scan(chatId: Long, onFile: (TdApi.Document) -> Unit) {

        td.send(TdApi.GetChatHistory(chatId, 0, 0, 100)) { res ->

            val messages = res as TdApi.Messages

            messages.messages.forEach {

                val c = it.content

                if (c is TdApi.MessageDocument) {
                    onFile(c.document)
                }
            }
        }
    }
}
