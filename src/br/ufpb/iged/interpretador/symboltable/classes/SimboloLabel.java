/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/

package br.ufpb.iged.interpretador.symboltable.classes;

import java.util.*;

import br.ufpb.iged.interpretador.bytecodeassembler.asm.BytecodeAssembler;

public class SimboloLabel {
	String name;

	/** Address in code memory */
	public int endereco;

	/** Is this ref'd before def'd. */
	boolean isForwardRef = false;

	/** Set when we see actual ID: definition */
	boolean isDefined = true;

	/** List of operands in memory we need to update after seeing def */
	Vector<Integer> forwardReferences = null;

	public SimboloLabel(String name) {
		this.name = name;
	}

	public SimboloLabel(String name, int endereco) {
		this(name);
		this.endereco = endereco;
	}

	public SimboloLabel(String name, int endereco, boolean forward) {
		this(name);
		isForwardRef = forward;
		if (forward) {
			// if forward reference, then address is address to update
			addForwardReference(endereco);
		} else {
			this.endereco = endereco;
		}
	}

	public void addForwardReference(int address) {
		if (forwardReferences == null) {
			forwardReferences = new Vector<Integer>();
		}
		forwardReferences.addElement(new Integer(address));
	}

	public void resolveForwardReferences(byte[] code) {
		isForwardRef = false;
		// need to patch up all references to this symbol
		Vector<Integer> opndsToPatch = forwardReferences;
		for (int addrToPatch : opndsToPatch) {
			/*
			 * System.out.println("updating operand at addr "+
			 * addr+" to be "+getAddress());
			 */
			BytecodeAssembler.escreverInteiro(code, addrToPatch, endereco);
		}
	}

	public String toString() {
		String refs = "";
		if (forwardReferences != null) {
			refs = "[refs=" + forwardReferences.toString() + "]";
		}
		return name + "@" + endereco + refs;
	}
}