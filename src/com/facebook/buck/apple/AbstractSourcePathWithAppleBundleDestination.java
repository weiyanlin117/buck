/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.apple;

import com.facebook.buck.core.rulekey.AddToRuleKey;
import com.facebook.buck.core.rulekey.AddsToRuleKey;
import com.facebook.buck.core.sourcepath.SourcePath;
import com.facebook.buck.core.util.immutables.BuckStyleImmutable;
import org.immutables.value.Value;

/**
 * Simple type representing a {@link com.facebook.buck.core.sourcepath.SourcePath} and a destination
 * {@link com.facebook.buck.apple.AppleBundleDestination} in a resulting bundle where a file or a
 * directory with this path should be copied.
 */
@Value.Immutable()
@BuckStyleImmutable
public abstract class AbstractSourcePathWithAppleBundleDestination
    implements AddsToRuleKey, Comparable<AbstractSourcePathWithAppleBundleDestination> {

  @Value.Parameter
  @AddToRuleKey
  public abstract SourcePath getSourcePath();

  @Value.Parameter
  @AddToRuleKey
  public abstract AppleBundleDestination getDestination();

  /**
   * Construct a new immutable {@code SourcePathWithAppleBundleDestination} instance with default
   * value of apple bundle destination.
   *
   * @param sourcePath The value for the {@code sourcePath} attribute
   * @return An immutable SourcePathWithAppleBundleDestination instance
   */
  public static SourcePathWithAppleBundleDestination of(SourcePath sourcePath) {
    return SourcePathWithAppleBundleDestination.builder()
        .setSourcePath(sourcePath)
        .setDestination(AppleBundleDestination.defaultValue())
        .build();
  }

  @Override
  public int compareTo(AbstractSourcePathWithAppleBundleDestination o) {
    if (getSourcePath() != o.getSourcePath()) {
      return getSourcePath().compareTo(o.getSourcePath());
    }
    if (getDestination() != o.getDestination()) {
      return getDestination().compareTo(o.getDestination());
    }
    return 0;
  }
}
