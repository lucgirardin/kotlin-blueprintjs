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
import React.ReactPortal
import React.Component__2

external interface IPortalProps : IProps {
    var onChildrenMount: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var container: HTMLElement?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IPortalState {
    var hasMounted: Boolean
}

external interface IPortalContext {
    var blueprintPortalClassName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Portal : Component__2<IPortalProps, IPortalState> {
    override var context: IPortalContext
    open var portalElement: Any
    override fun render(): ReactPortal?
    override var componentDidMount: () -> Unit
    open fun componentDidUpdate(prevProps: IPortalProps)
    override var componentWillUnmount: () -> Unit
    open var createContainerElement: Any
    open var unstableRenderNoPortal: Any

    companion object {
        var displayName: String
        var contextTypes: ValidationMap<IPortalContext>
        var defaultProps: IPortalProps
    }
}