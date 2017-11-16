/*
 *    Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.mindorks.mvp.ui.base;

/**
 * Created by Arnold on 22-10-2017.
 */

//It is an interface that is implemented by BasePresenter, it acts as
//base presenter interface that is extended by all other presenter interfaces.
public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

}
