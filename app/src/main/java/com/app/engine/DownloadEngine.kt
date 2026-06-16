package com.app.engine

class DownloadEngine(private val td: TDClient) {

    fun download(doc: TdApi.Document) {

        td.send(
            TdApi.DownloadFile(
                doc.document.id,
                32,
                0,
                0,
                true
            )
        )
    }
}
