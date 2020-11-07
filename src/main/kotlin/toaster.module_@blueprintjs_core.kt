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

external interface IToaster {
    fun show(props: IToastProps, key: String = definedExternally): String
    fun dismiss(key: String)
    fun clear()
    fun getToasts(): Array<IToastProps /* IToastProps & `T$37` */>
}

external interface IToasterProps : IProps {
    var autoFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var canEscapeKeyClear: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var usePortal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var position: Any?
        get() = definedExternally
        set(value) = definedExternally
    var maxToasts: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IToasterState {
    var toasts: Array<IToastProps /* IToastProps & `T$37` */>
}

external open class Toaster(props: P, context: Any = definedExternally) : AbstractPureComponent2__2<IToasterProps, IToasterState>, IToaster {
    open var toastId: Any
    override fun show(props: IToastProps, key: String): String
    open fun dismiss(key: String, timeoutExpired: Boolean = definedExternally)
    override fun clear()
    override fun getToasts(): Array<IToastProps /* IToastProps & `T$37` */>
    override fun render(): Element
    override fun validateProps(__0: IToasterProps)
    open var isNewToastKey: Any
    open var dismissIfAtLimit: Any
    open var renderToast: Any
    open var createToastOptions: Any
    open var getPositionClasses: Any
    open var getDismissHandler: Any
    open var handleClose: Any

    companion object {
        var displayName: String
        var defaultProps: IToasterProps
        fun create(props: IToasterProps = definedExternally, container: HTMLElement = definedExternally): IToaster
    }
}