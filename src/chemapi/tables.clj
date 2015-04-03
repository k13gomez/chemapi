(ns chemapi.tables)

(def periodic-table
  [{:number 1 :symbol "H" :name "hydrogen" :color "0xffffff"}
   {:number 2 :symbol "He" :name "helium" :color "0xd9ffff"}
   {:number 3 :symbol "Li" :name "lithium" :color "0xcc80ff"}
   {:number 4 :symbol "Be" :name "beryllium" :color "0xc2ff00"}
   {:number 5 :symbol "B" :name "boron" :color "0xffb5b5"}
   {:number 6 :symbol "C" :name "carbon" :color "0x909090"}
   {:number 7 :symbol "N" :name "nitrogen" :color "0x3050f8"}
   {:number 8 :symbol "O" :name "oxygen" :color "0xff0d0d"}
   {:number 9 :symbol "F" :name "fluorine" :color "0x90e050"}
   {:number 10 :symbol "Ne" :name "neon" :color "0xb3e3f5"}
   {:number 11 :symbol "Na" :name "sodium" :color "0xab5cf2"}
   {:number 12 :symbol "Mg" :name "magnesium" :color "0x8aff00"}
   {:number 13 :symbol "Al" :name "aluminium" :color "0xbfa6a6"}
   {:number 14 :symbol "Si" :name "silicon" :color "0xf0c8a0"}
   {:number 15 :symbol "P" :name "phosphorus" :color "0xff8000"}
   {:number 16 :symbol "S" :name "sulfur" :color "0xffff30"}
   {:number 17 :symbol "Cl" :name "chlorine" :color "0x1ff01f"}
   {:number 18 :symbol "Ar" :name "argon" :color "0x80d1e3"}
   {:number 19 :symbol "K" :name "potassium" :color "0x8f40d4"}
   {:number 20 :symbol "Ca" :name "calcium" :color "0x3dff00"}
   {:number 21 :symbol "Sc" :name "scandium" :color "0xe6e6e6"}
   {:number 22 :symbol "Ti" :name "titanium" :color "0xbfc2c7"}
   {:number 23 :symbol "V" :name "vanadium" :color "0xa6a6ab"}
   {:number 24 :symbol "Cr" :name "chromium" :color "0x8a99c7"}
   {:number 25 :symbol "Mn" :name "manganese" :color "0x9c7ac7"}
   {:number 26 :symbol "Fe" :name "iron" :color "0xe06633"}
   {:number 27 :symbol "Co" :name "cobalt" :color "0xf090a0"}
   {:number 28 :symbol "Ni" :name "nickel" :color "0x50d050"}
   {:number 29 :symbol "Cu" :name "copper" :color "0xc88033"}
   {:number 30 :symbol "Zn" :name "zinc" :color "0x7d80b0"}
   {:number 31 :symbol "Ga" :name "gallium" :color "0xc28f8f"}
   {:number 32 :symbol "Ge" :name "germanium" :color "0x668f8f"}
   {:number 33 :symbol "As" :name "arsenic" :color "0xbd80e3"}
   {:number 34 :symbol "Se" :name "selenium" :color "0xffa100"}
   {:number 35 :symbol "Br" :name "bromine" :color "0xa62929"}
   {:number 36 :symbol "Kr" :name "krypton" :color "0x5cb8d1"}
   {:number 37 :symbol "Rb" :name "rubidium" :color "0x702eb0"}
   {:number 38 :symbol "Sr" :name "strontium" :color "0x00ff00"}
   {:number 39 :symbol "Y" :name "yttrium" :color "0x94ffff"}
   {:number 40 :symbol "Zr" :name "zirconium" :color "0x94e0e0"}
   {:number 41 :symbol "Nb" :name "niobium" :color "0x73c2c9"}
   {:number 42 :symbol "Mo" :name "molybdenum" :color "0x54b5b5"}
   {:number 43 :symbol "Tc" :name "technetium" :color "0x3b9e9e"}
   {:number 44 :symbol "Ru" :name "ruthenium" :color "0x248f8f"}
   {:number 45 :symbol "Rh" :name "rhodium" :color "0x0a7d8c"}
   {:number 46 :symbol "Pd" :name "palladium" :color "0x006985"}
   {:number 47 :symbol "Ag" :name "silver" :color "0xc0c0c0"}
   {:number 48 :symbol "Cd" :name "cadmium" :color "0xffd98f"}
   {:number 49 :symbol "In" :name "indium" :color "0xa67573"}
   {:number 50 :symbol "Sn" :name "tin" :color "0x668080"}
   {:number 51 :symbol "Sb" :name "antimony" :color "0x9e63b5"}
   {:number 52 :symbol "Te" :name "tellurium" :color "0xd47a00"}
   {:number 53 :symbol "I" :name "iodine" :color "0x940094"}
   {:number 54 :symbol "Xe" :name "xenon" :color "0x429eb0"}
   {:number 55 :symbol "Cs" :name "caesium" :color "0x57178f"}
   {:number 56 :symbol "Ba" :name "barium" :color "0x00c900"}
   {:number 57 :symbol "La" :name "lanthanum" :color "0x70d4ff"}
   {:number 58 :symbol "Ce" :name "cerium" :color "0xffffc7"}
   {:number 59 :symbol "Pr" :name "praseodymium" :color "0xd9ffc7"}
   {:number 60 :symbol "Nd" :name "neodymium" :color "0xc7ffc7"}
   {:number 61 :symbol "Pm" :name "promethium" :color "0xa3ffc7"}
   {:number 62 :symbol "Sm" :name "samarium" :color "0x8fffc7"}
   {:number 63 :symbol "Eu" :name "europium" :color "0x61ffc7"}
   {:number 64 :symbol "Gd" :name "gadolinium" :color "0x45ffc7"}
   {:number 65 :symbol "Tb" :name "terbium" :color "0x30ffc7"}
   {:number 66 :symbol "Dy" :name "dysprosium" :color "0x1fffc7"}
   {:number 67 :symbol "Ho" :name "holmium" :color "0x00ff9c"}
   {:number 68 :symbol "Er" :name "erbium" :color "0x00e675"}
   {:number 69 :symbol "Tm" :name "thulium" :color "0x00d452"}
   {:number 70 :symbol "Yb" :name "ytterbium" :color "0x00bf38"}
   {:number 71 :symbol "Lu" :name "lutetium" :color "0x00ab24"}
   {:number 72 :symbol "Hf" :name "hafnium" :color "0x4dc2ff"}
   {:number 73 :symbol "Ta" :name "tantalum" :color "0x4da6ff"}
   {:number 74 :symbol "W" :name "tungsten" :color "0x2194d6"}
   {:number 75 :symbol "Re" :name "rhenium" :color "0x267dab"}
   {:number 76 :symbol "Os" :name "osmium" :color "0x266696"}
   {:number 77 :symbol "Ir" :name "iridium" :color "0x175487"}
   {:number 78 :symbol "Pt" :name "platinum" :color "0xd0d0e0"}
   {:number 79 :symbol "Au" :name "gold" :color "0xffd123"}
   {:number 80 :symbol "Hg" :name "mercury" :color "0xb8b8d0"}
   {:number 81 :symbol "Tl" :name "thallium" :color "0xa6544d"}
   {:number 82 :symbol "Pb" :name "lead" :color "0x575961"}
   {:number 83 :symbol "Bi" :name "bismuth" :color "0x9e4fb5"}
   {:number 84 :symbol "Po" :name "polonium" :color "0xab5c00"}
   {:number 85 :symbol "At" :name "astatine" :color "0x754f45"}
   {:number 86 :symbol "Rn" :name "radon" :color "0x428296"}
   {:number 87 :symbol "Fr" :name "francium" :color "0x420066"}
   {:number 88 :symbol "Ra" :name "radium" :color "0x007d00"}
   {:number 89 :symbol "Ac" :name "actinium" :color "0x70abfa"}
   {:number 90 :symbol "Th" :name "thorium" :color "0x00baff"}
   {:number 91 :symbol "Pa" :name "protactinium" :color "0x00a1ff"}
   {:number 92 :symbol "U" :name "uranium" :color "0x008fff"}
   {:number 93 :symbol "Np" :name "neptunium" :color "0x0080ff"}
   {:number 94 :symbol "Pu" :name "plutonium" :color "0x006bff"}
   {:number 95 :symbol "Am" :name "americium" :color "0x545cf2"}
   {:number 96 :symbol "Cm" :name "curium" :color "0x785ce3"}
   {:number 97 :symbol "Bk" :name "berkelium" :color "0x8a4fe3"}
   {:number 98 :symbol "Cf" :name "californium" :color "0xa136d4"}
   {:number 99 :symbol "Es" :name "einsteinium" :color "0xb31fd4"}
   {:number 100 :symbol "Fm" :name "fermium" :color "0xb31fba"}
   {:number 101 :symbol "Md" :name "mendelevium" :color "0xb30da6"}
   {:number 102 :symbol "No" :name "nobelium" :color "0xbd0d87"}
   {:number 103 :symbol "Lr" :name "lawrencium" :color "0xc70066"}
   {:number 104 :symbol "Rf" :name "rutherfordium" :color "0xcc0059"}
   {:number 105 :symbol "Db" :name "dubnium" :color "0xd1004f"}
   {:number 106 :symbol "Sg" :name "seaborgium" :color "0xd90045"}
   {:number 107 :symbol "Bh" :name "bohrium" :color "0xe00038"}
   {:number 108 :symbol "Hs" :name "hassium" :color "0xe6002e"}
   {:number 109 :symbol "Mt" :name "meitnerium" :color "0xeb0026"}
   {:number 110 :symbol "Ds" :name "darmstadtium" :color "0xeb0026"}
   {:number 111 :symbol "Rg" :name "roentgenium" :color "0xeb0026"}
   {:number 112 :symbol "Cn" :name "copernicium" :color "0x000000"}
   {:number 113 :symbol "Uut" :name "ununtrium" :color "0x000000"}
   {:number 114 :symbol "Fl" :name "flerovium" :color "0x000000"}
   {:number 115 :symbol "Uup" :name "ununpentium" :color "0x000000"}
   {:number 116 :symbol "Lv" :name "livermorium" :color "0x000000"}
   {:number 117 :symbol "Uus" :name "ununseptium" :color "0x000000"}
   {:number 118 :symbol "Uuo" :name "ununoctium" :color "0x000000"}])

(def bond-table
  [{:type 1 :name "single"}
   {:type 2 :name "double"}
   {:type 3 :name "triple"}])