/*
 * semanticcms-all - Convenience POM to include most SemanticCMS features, not including documentation, AutoGit, or theme.
 * Copyright (C) 2021, 2022  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-all.
 *
 * semanticcms-all is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-all is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-all.  If not, see <https://www.gnu.org/licenses/>.
 */
module com.semanticcms.all {
  // Direct
  requires transitive com.semanticcms.changelog.taglib; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-changelog-taglib</artifactId>
  requires transitive com.semanticcms.core.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all</artifactId>
  requires transitive com.semanticcms.dia.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-all</artifactId>
  requires transitive com.semanticcms.file.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-all</artifactId>
  requires transitive com.semanticcms.news.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all</artifactId>
  requires transitive com.semanticcms.openfile.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-all</artifactId>
  requires transitive com.semanticcms.pages.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-pages-all</artifactId>
  requires transitive com.semanticcms.resources.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-resources-all</artifactId>
  requires transitive com.semanticcms.section.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all</artifactId>
  requires transitive com.semanticcms.tagreference; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-tag-reference</artifactId>
} // TODO: Avoiding rewrite-maven-plugin-4.22.2 truncation
