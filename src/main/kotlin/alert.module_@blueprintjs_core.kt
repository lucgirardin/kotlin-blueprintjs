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
import React.CSSProperties
import React.SyntheticEvent__1
import global.JSX.Element

external interface IAlertProps : IOverlayLifecycleProps, IProps {
    var canEscapeKeyCancel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canOutsideClickCancel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var cancelButtonText: String?
        get() = definedExternally
        set(value) = definedExternally
    var confirmButtonText: String?
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var intent: Any?
        get() = definedExternally
        set(value) = definedExternally
    var isOpen: Boolean
    var style: CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var transitionDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var portalContainer: HTMLElement?
        get() = definedExternally
        set(value) = definedExternally
    val onCancel: ((evt: SyntheticEvent__1<HTMLElement>) -> Unit)?
    val onConfirm: ((evt: SyntheticEvent__1<HTMLElement>) -> Unit)?
    val onClose: ((confirmed: Boolean, evt: SyntheticEvent__1<HTMLElement>) -> Unit)?
}

external open class Alert(props: P, context: Any = definedExternally) : AbstractPureComponent2__1<IAlertProps> {
    override fun render(): Element
    override fun validateProps(props: IAlertProps)
    open var handleCancel: Any
    open var handleConfirm: Any
    open var internalHandleCallbacks: Any

    companion object {
        var defaultProps: IAlertProps
        var displayName: String
    }
}