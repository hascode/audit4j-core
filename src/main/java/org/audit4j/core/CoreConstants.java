/*
 * Copyright 2014 Janith Bandara, This source is a part of
 * Audit4j - An open source auditing framework.
 * http://audit4j.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.audit4j.core;

/**
 * The Class CoreConstants.
 *
 * @author <a href="mailto:janith3000@gmail.com">Janith Bandara</a>
 *
 * @since 1.0.0
 */
public final class CoreConstants {

	/** The Constant APP_NAME. */
	public static final String APP_NAME = "Audit4j";

	/** The Constant RELEASE_VERSION. */
	public static final String RELEASE_VERSION = "2.2.0";

	/** The Constant RELEASE_DATE. */
	public static final String RELEASE_DATE = "2014-08-29T12:40:21.077Z";

	/** The Constant SUPPORT_JAVA_VERSION. */
	public static final String SUPPORT_JAVA_VERSION = "7";

	/** The Constant AUDIT_EXTENTION. */
	public static final String AUDIT_EXTENTION = ".audit";

	/** The Constant SITE_URL. */
	public static final String SITE_URL = "http://audit4j.org";

	/** The Constant CONFIG_FILE_NAME. */
	public static final String CONFIG_FILE_NAME = "audit4j.conf.yml";

	/** The Constant COLON_CHAR. */
	public static final char COLON_CHAR = ':';

	/** The Constant COMMA_CHAR. */
	public static final char COMMA_CHAR = ',';

	/** The Constant DASH_CHAR. */
	public static final char DASH_CHAR = '-';

	/** The Constant ARROW. */
	public static final String ARROW = "==>";

	/** The Constant PIPE. */
	public static final char PIPE = '|';

	/** The Constant SPACE. */
	public static final char SPACE = ' ';

	/** The Constant WINDOWS_SEPARATOR. */
	public static final char WINDOWS_SEPARATOR = '\\';

	/** The Constant UNIX_SEPARATOR. */
	public static final char UNIX_SEPARATOR = '/';

	/** The Constant READ_WRITE. */
	public static final String READ_WRITE = "rw";

	/** The Constant NEW_LINE. */
	public static final String NEW_LINE = "\n";

	/** The Constant DEFAULT_ACTOR. */
	public static final String DEFAULT_ACTOR = "Audit4j User";

	/** The Constant ACTION. */
	public static final String ACTION = "action";

	/** The Constant SALT. */
	public static final String DEFAULT_SECURE_SALT = "232332324";

	/** The Constant DEFAULT_SECURE_KEY. */
	public static final String DEFAULT_SECURE_KEY = "Aud1T4jSecureKey";

	/** The Constant IV. */
	public static final String IV = "e675f725e675f725";

	/** The Constant ENCODE_UTF8. */
	public static final String ENCODE_UTF8 = "UTF-8";

	/** The Constant EMBEDED_DB_NAME. */
	public static final String EMBEDED_DB_NAME = "audit4j";
}
