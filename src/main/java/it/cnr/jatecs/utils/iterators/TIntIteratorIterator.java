/*
 * This file is part of JaTeCS.
 *
 * JaTeCS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JaTeCS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JaTeCS.  If not, see <http://www.gnu.org/licenses/>.
 *
 * The software has been mainly developed by (in alphabetical order):
 * - Andrea Esuli (andrea.esuli@isti.cnr.it)
 * - Tiziano Fagni (tiziano.fagni@isti.cnr.it)
 * - Alejandro Moreo Fernández (alejandro.moreo@isti.cnr.it)
 * Other past contributors were:
 * - Giacomo Berardi (giacomo.berardi@isti.cnr.it)
 */

package it.cnr.jatecs.utils.iterators;

import java.util.Iterator;

import gnu.trove.TIntHashSet;
import gnu.trove.TIntIterator;
import it.cnr.jatecs.utils.iterators.interfaces.IIntIterator;

public class TIntIteratorIterator implements IIntIterator {

    private TIntHashSet _hashSet;
    private TIntIterator _iter;

    public TIntIteratorIterator(TIntHashSet hashSet) {
        _hashSet = hashSet;

        begin();
    }

    public boolean hasNext() {
        return _iter.hasNext();
    }

    public Integer next() {
        return _iter.next();
    }

    public void begin() {
        _iter = _hashSet.iterator();
    }
    

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Remove not allowed for this IIntIterator implementation.");		
	}

	@Override
	public Iterator<Integer> iterator() {
		return this;
	}
}
