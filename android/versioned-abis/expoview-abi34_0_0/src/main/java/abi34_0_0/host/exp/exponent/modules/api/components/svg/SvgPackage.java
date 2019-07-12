/*
 * Copyright (c) 2015-present, Horcrux.
 * All rights reserved.
 *
 * This source code is licensed under the MIT-style license found in the
 * LICENSE file in the root directory of this source tree.
 */


package abi34_0_0.host.exp.exponent.modules.api.components.svg;

import abi34_0_0.com.facebook.react.ReactPackage;
import abi34_0_0.com.facebook.react.bridge.JavaScriptModule;
import abi34_0_0.com.facebook.react.bridge.NativeModule;
import abi34_0_0.com.facebook.react.bridge.ReactApplicationContext;
import abi34_0_0.com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.annotation.Nonnull;

import static abi34_0_0.host.exp.exponent.modules.api.components.svg.RenderableViewManager.*;

public class SvgPackage implements ReactPackage {

    @Nonnull
    @Override
    public List<ViewManager> createViewManagers(@Nonnull ReactApplicationContext reactContext) {
        return Arrays.<ViewManager>asList(
                new GroupViewManager(),
                new PathViewManager(),
                new CircleViewManager(),
                new EllipseViewManager(),
                new LineViewManager(),
                new RectViewManager(),
                new TextViewManager(),
                new TSpanViewManager(),
                new TextPathViewManager(),
                new ImageViewManager(),
                new ClipPathViewManager(),
                new DefsViewManager(),
                new UseViewManager(),
                new SymbolManager(),
                new LinearGradientManager(),
                new RadialGradientManager(),
                new PatternManager(),
                new MaskManager(),
                new SvgViewManager());
    }

    @Nonnull
    @Override
    public List<NativeModule> createNativeModules(@Nonnull ReactApplicationContext reactContext) {
        return Collections.<NativeModule>singletonList(new SvgViewModule(reactContext));
    }

    @SuppressWarnings("unused")
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }
}