/*
 * Copyright 1999-2019 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.csp.sentinel.trust.auth;

import java.util.Map;

import com.alibaba.csp.sentinel.trust.auth.rule.AuthRule;
import com.alibaba.csp.sentinel.trust.auth.rule.JwtRule;

/**
 * @author lwj
 * @since 2.0.0
 */
public class Rules {

    private final Map<String, AuthRule> allowAuthRules;

    private final Map<String, AuthRule> denyAuthRules;

    private final Map<String, JwtRule> jwtRules;

    public Rules(Map<String, AuthRule> allowAuthRules, Map<String, AuthRule> denyAuthRules,
                 Map<String, JwtRule> jwtRules) {
        this.allowAuthRules = allowAuthRules;
        this.denyAuthRules = denyAuthRules;
        this.jwtRules = jwtRules;
    }

    public Map<String, AuthRule> getAllowAuthRules() {
        return allowAuthRules;
    }

    public Map<String, AuthRule> getDenyAuthRules() {
        return denyAuthRules;
    }

    public Map<String, JwtRule> getJwtRules() {
        return jwtRules;
    }

    @Override
    public String toString() {
        return "Rules{" + "allowAuthRules=" + allowAuthRules + ", denyAuthRules=" + denyAuthRules + ", jwtRules="
            + jwtRules + '}';
    }
}
