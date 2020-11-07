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
import React.PureComponent__2

external open class AbstractPureComponent<P, S>(props: P, context: Any = definedExternally) : PureComponent__2<P, S> {
    open var displayName: Any
    open var timeoutIds: Any
    open fun componentWillReceiveProps(nextProps: P /* P & `T$0` */)
    override var componentWillUnmount: () -> Unit
    open fun setTimeout(callback: () -> Unit, timeout: Number = definedExternally): () -> Unit
    open var clearTimeouts: () -> Unit
    open fun validateProps(_props: P /* P & `T$0` */)
}