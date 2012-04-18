/*
 *   YouTestit source code:
 *   ======================
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *  
        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *   Links:
 *   ======
 *   Homepage : http://www.youtestit.org
 *   Git      : https://github.com/youtestit
*/
package org.youtestit.controllers.services.freemarker;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Singleton;



/**
 * Beantest
 * @author "<a href='mailto:patrickguillerm@gmail.com'>Patrick Guillerm</a>"
 * @since Mar 27, 2012
 */
@Named
public class Beantest {
    // =========================================================================
    // ATTRIBUTES
    // =========================================================================

    private String toto="toto";

    // =========================================================================
    // CONSTRUCTORS
    // =========================================================================

    @PostConstruct
    private void init(){
        toto="Toto !!!!";
    }

    public String getToto() {
        return toto;
    }

    public void setToto(String toto) {
        this.toto = toto;
    }
    
}


