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
import global.JSX.Element

external interface IDialogProps : IOverlayableProps, IBackdropProps, IProps {
    var isOpen: Boolean
    var icon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var isCloseButtonShown: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var style: CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var title: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var transitionName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Dialog(props: P, context: Any = definedExternally) : AbstractPureComponent2__1<IDialogProps> {
    override fun render(): Element
    override fun validateProps(props: IDialogProps)
    open var maybeRenderCloseButton: Any
    open var maybeRenderHeader: Any

    companion object {
        var defaultProps: IDialogProps
        var displayName: String
    }
}