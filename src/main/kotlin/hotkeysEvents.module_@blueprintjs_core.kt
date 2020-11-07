@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")


@file:JsModule("@blueprintjs/core")
package com.palantir.blueprintjs

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external enum class HotkeyScope {
    LOCAL /* = "local" */,
    GLOBAL /* = "global" */
}

external open class HotkeysEvents(scope: HotkeyScope) {
    open var scope: Any
    open var actions: Any
    open fun count(): Number
    open fun clear()
    open fun setHotkeys(props: IHotkeysProps /* IHotkeysProps & `T$32` */)
    open var handleKeyDown: (e: KeyboardEvent) -> Unit
    open var handleKeyUp: (e: KeyboardEvent) -> Unit
    open var invokeNamedCallbackIfComboRecognized: Any
    open var isScope: Any
    open var isTextInput: Any
}