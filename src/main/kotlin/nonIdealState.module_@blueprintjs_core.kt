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
import global.JSX.Element

external interface INonIdealStateProps : IProps {
    var action: Element?
        get() = definedExternally
        set(value) = definedExternally
    var children: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var description: dynamic /* ReactElement__0? | String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var title: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
}

external open class NonIdealState(props: P, context: Any = definedExternally) : AbstractPureComponent2__1<INonIdealStateProps> {
    override fun render(): Element
    open var maybeRenderVisual: Any

    companion object {
        var displayName: String
    }
}