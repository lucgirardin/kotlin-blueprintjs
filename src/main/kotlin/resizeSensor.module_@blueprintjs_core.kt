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

external interface IResizeSensorProps {
    var onResize: (entries: Array<IResizeEntry>) -> Unit
    var observeParents: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class ResizeSensor(props: P, context: Any = definedExternally) : AbstractPureComponent2__1<IResizeSensorProps> {
    open var element: Any
    open var observer: Any
    override fun render(): dynamic /* String? | Number? | Boolean? | Any? | React.ReactElement<Any, dynamic /* String | (props: Any) -> React.ReactElement<Any, dynamic /* String | Any */>? | Any */>? | React.ReactPortal? */
    override var componentDidMount: () -> Unit
    open fun componentDidUpdate(prevProps: IResizeSensorProps)
    override var componentWillUnmount: () -> Unit
    open var observeElement: Any
    open var getElement: Any

    companion object {
        var displayName: String
    }
}