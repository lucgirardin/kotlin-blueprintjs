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

typealias TreeEventHandler<T> = (node: ITreeNode<T>, nodePath: Array<Number>, e: MouseEvent__1<HTMLElement>) -> Unit

external interface ITreeProps<T> : IProps {
    var contents: Array<ITreeNode<T>>
    var onNodeClick: TreeEventHandler<T>?
        get() = definedExternally
        set(value) = definedExternally
    var onNodeCollapse: TreeEventHandler<T>?
        get() = definedExternally
        set(value) = definedExternally
    var onNodeContextMenu: TreeEventHandler<T>?
        get() = definedExternally
        set(value) = definedExternally
    var onNodeDoubleClick: TreeEventHandler<T>?
        get() = definedExternally
        set(value) = definedExternally
    var onNodeExpand: TreeEventHandler<T>?
        get() = definedExternally
        set(value) = definedExternally
    var onNodeMouseEnter: TreeEventHandler<T>?
        get() = definedExternally
        set(value) = definedExternally
    var onNodeMouseLeave: TreeEventHandler<T>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Tree<T> : Component__1<ITreeProps<T>> {
    open var nodeRefs: Any
    override fun render(): Element
    open fun getNodeContentElement(nodeId: String): HTMLElement?
    open fun getNodeContentElement(nodeId: Number): HTMLElement?
    open var renderNodes: Any
    open var handleNodeCollapse: Any
    open var handleNodeClick: Any
    open var handleContentRef: Any
    open var handleNodeContextMenu: Any
    open var handleNodeDoubleClick: Any
    open var handleNodeExpand: Any
    open var handleNodeMouseEnter: Any
    open var handleNodeMouseLeave: Any
    open var handlerHelper: Any

    companion object {
        var displayName: String
        fun <U> ofType(): Any
        fun <U> nodeFromPath(path: Array<Number>, treeNodes: Array<ITreeNode<U>> = definedExternally): ITreeNode<U>
    }
}