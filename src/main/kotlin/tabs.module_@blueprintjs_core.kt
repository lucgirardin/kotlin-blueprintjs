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
import React.FunctionComponent__0
import React.MouseEvent__1
import React.CSSProperties
import global.JSX.Element
import React.FunctionComponent

external var Expander: FunctionComponent__0

external interface `L$0` {
    @nativeInvoke
    operator fun invoke(newTabId: String, prevTabId: String?, event: MouseEvent__1<HTMLElement>)
    @nativeInvoke
    operator fun invoke(newTabId: String, prevTabId: Number?, event: MouseEvent__1<HTMLElement>)
    @nativeInvoke
    operator fun invoke(newTabId: Number, prevTabId: String?, event: MouseEvent__1<HTMLElement>)
    @nativeInvoke
    operator fun invoke(newTabId: Number, prevTabId: Number?, event: MouseEvent__1<HTMLElement>)
}

external interface ITabsProps : IProps {
    var animate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var defaultSelectedTabId: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var id: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var renderActiveTabPanelOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var selectedTabId: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var vertical: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    val onChange: `L$0`?
        get() = definedExternally
}

external interface ITabsPropsPartial : IProps {
    var animate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var defaultSelectedTabId: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var id: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var renderActiveTabPanelOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var selectedTabId: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var vertical: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((newTabId: dynamic /* String | Number */, prevTabId: dynamic /* String? | Number? */, event: MouseEvent__1<HTMLElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ITabsState {
    var indicatorWrapperStyle: CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var selectedTabId: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$36` {
    var selectedTabId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
}

external open class Tabs(props: ITabsProps) : AbstractPureComponent2__2<ITabsProps, ITabsState> {
    open var tablistElement: Any
    open var refHandlers: Any
    override fun render(): Element
    override var componentDidMount: () -> Unit
    open fun componentDidUpdate(prevProps: ITabsProps, prevState: ITabsState)
    open var getInitialSelectedTabId: Any
    open var getKeyCodeDirection: Any
    open var getTabChildrenProps: Any
    open var getTabChildren: Any
    open var getTabElements: Any
    open var handleKeyDown: Any
    open var handleKeyPress: Any
    open var handleTabClick: Any
    open var moveSelectionIndicator: Any
    open var renderTabPanel: Any
    open var renderTabTitle: Any

    companion object {
        var Expander: FunctionComponent<Any>
        var Tab: Any
        var defaultProps: ITabsPropsPartial
        var displayName: String
        fun getDerivedStateFromProps(__0: ITabsProps): `T$36`?
    }
}