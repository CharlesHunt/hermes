/*
 * Copyright(c) 2016 Center for E-Commerce Infrastructure Development, The
 * University of Hong Kong (HKU). All Rights Reserved.
 *
 * This software is licensed under the GNU GENERAL PUBLIC LICENSE Version 2.0 [1]
 *
 * [1] http://www.gnu.org/licenses/old-licenses/gpl-2.0.txt
 */

package hk.hku.cecid.piazza.commons.json;


public class JsonParseException extends Exception {
    public JsonParseException(String message) {
        super(message);
    }

    public JsonParseException(Exception exception) {
        super(exception);
    }
}