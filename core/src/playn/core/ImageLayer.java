/**
 * Copyright 2010 The PlayN Authors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package playn.core;

/**
 * TODO
 */
public interface ImageLayer extends Layer.HasSize {

  /**
   * TODO
   */
  void clearHeight();

  /**
   * TODO
   */
  void clearSourceRect();

  /**
   * TODO
   */
  void clearWidth();

  /**
   * TODO
   */
  Image image();

  /**
   * TODO
   */
  void setHeight(float height);

  /**
   * TODO
   */
  void setImage(Image image);

  /**
   * TODO
   * 
   * The default is <code>false</code>.
   */
  void setRepeatX(boolean repeat);

  /**
   * TODO
   * 
   * The default is <code>false</code>.
   */
  void setRepeatY(boolean repeat);

  /**
   * TODO
   * 
   * TODO(jgw): This cannot work at the same time as repeat. Need to document this clearly.
   */
  void setSourceRect(float sx, float sy, float sw, float sh);

  /**
   * TODO
   */
  void setWidth(float width);

  /**
   * TODO
   */
  void setSize(float width, float height);
}
