/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.camera.app;

import android.content.Context;
import android.location.Location;

/**
 * Dummy Location provider to be used when location information shouldn't be provided to the client.
 */
public class NoOpLocationProvider implements LocationProvider {

    public NoOpLocationProvider(Context context) {
    }

    @Override
    public Location getCurrentLocation() {
        return null;
    }

    @Override
    public void recordLocation(boolean recordLocation) {
    }

    @Override
    public void disconnect() {
    }
}
