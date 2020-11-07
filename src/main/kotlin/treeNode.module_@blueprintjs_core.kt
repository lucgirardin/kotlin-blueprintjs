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
import React.MouseEvent__1
import global.JSX.Element
import React.Component__1

external interface ITreeNode<T> : IProps {
    var childNodes: Array<ITreeNode<T>>?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hasCaret: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var id: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var isExpanded: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isSelected: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* String | JSX.Element */
        get() = definedExternally
        set(value) = definedExternally
    var secondaryLabel: dynamic /* String? | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var nodeData: T?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ITreeNodeProps<T> : ITreeNode<T> {
    var children: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var contentRef: ((node: TreeNode<T>, element: HTMLDivElement?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number
    var key: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var onClick: ((node: TreeNode<T>, e: MouseEvent__1<HTMLDivElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onCollapse: ((node: TreeNode<T>, e: MouseEvent__1<HTMLSpanElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onContextMenu: ((node: TreeNode<T>, e: MouseEvent__1<HTMLDivElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onDoubleClick: ((node: TreeNode<T>, e: MouseEvent__1<HTMLDivElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onExpand: ((node: TreeNode<T>, e: MouseEvent__1<HTMLSpanElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseEnter: ((node: TreeNode<T>, e: MouseEvent__1<HTMLDivElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseLeave: ((node: TreeNode<T>, e: MouseEvent__1<HTMLDivElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var path: Array<Number>
}

external open class TreeNode<T> : Component__1<ITreeNodeProps<T>> {
    override fun render(): Element
    open var maybeRenderCaret: Any
    open var maybeRenderSecondaryLabel: Any
    open var handleCaretClick: Any
    open var handleClick: Any
    open var handleContentRef: Any
    open var handleContextMenu: Any
    open var handleDoubleClick: Any
    open var handleMouseEnter: Any
    open var handleMouseLeave: Any

    companion object {
        var displayName: String
        fun <U> ofType(): Any
    }
}