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
import React.ReactElement

external interface ICollapseProps : IProps {
    var component: dynamic /* Any | ComponentClass__1<any>? | FunctionComponent<any>? */
        get() = definedExternally
        set(value) = definedExternally
    var isOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var keepChildrenMounted: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var transitionDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ICollapseState {
    var animationState: AnimationStates
    var height: String?
    var heightWhenOpen: Number?
}

external enum class AnimationStates {
    OPEN_START /* = 0 */,
    OPENING /* = 1 */,
    OPEN /* = 2 */,
    CLOSING_START /* = 3 */,
    CLOSING /* = 4 */,
    CLOSED /* = 5 */
}

external open class Collapse(props: P, context: Any = definedExternally) : AbstractPureComponent2__2<ICollapseProps, ICollapseState> {
    open var contents: Any
    override fun render(): ReactElement<Any, dynamic /* String | (props: Any) -> React.ReactElement<Any, dynamic /* String | Any */>? | Any */>
    override var componentDidMount: () -> Unit
    open fun componentDidUpdate()
    open var contentsRefHandler: Any
    open var onDelayedStateChange: Any

    companion object {
        var displayName: String
        var defaultProps: ICollapseProps
        fun getDerivedStateFromProps(props: ICollapseProps, state: ICollapseState): dynamic /* `T$25`? | `T$26`? */
    }
}