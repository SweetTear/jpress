/**
 * Copyright (c) 2016-2019, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jpress.module.page.controller;

import io.jboot.utils.StrUtils;
import io.jboot.web.controller.annotation.RequestMapping;
import io.jpress.commons.utils.CommonsUtils;
import io.jpress.module.page.model.SinglePage;
import io.jpress.module.page.service.SinglePageService;
import io.jpress.web.base.TemplateControllerBase;
import io.jpress.web.handler.JPressHandler;

import javax.inject.Inject;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Package io.jpress.module.page.controller
 */
@RequestMapping("/page")
public class PageController extends TemplateControllerBase {

    @Inject
    private SinglePageService sps;

    public void index() {

        String target = StrUtils.urlDecode(JPressHandler.getCurrentTarget());
        String slug = target.substring(1);

        SinglePage page = sps.findFirstBySlug(slug);

        if (page == null || !page.isNormal()) {
            renderError(404);
            return;
        }

        setSeoTitle(page.getTitle());
        setSeoKeywords(page.getMetaKeywords());
        setSeoDescription(StrUtils.isBlank(page.getMetaDescription())
                ? CommonsUtils.maxLength(page.getText(), 100)
                : page.getMetaDescription());

        setMenuActive(menu -> menu.getUrl().indexOf("/") <= 1 && menu.getUrl().startsWith(target));

        setAttr("page", page);

        render(page.getHtmlView());
    }

}
