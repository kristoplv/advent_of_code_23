from collections import namedtuple
input = open('C:/Users/KristoMarleen/Documents/advent_of_code_23/day_2/input.txt').read()

def gamecubes(s):
    (l, r), d = s.split(':'), {'red':0, 'green':0, 'blue':0}
    for game in r.replace(',', ';').split(';'):
        n, c = game.split()
        d[c] = max(d[c], int(n))
    return namedtuple('gcubes', 'gid r g b')(int(l.split()[1]), d['red'], d['green'], d['blue'])

games = [gamecubes(l) for l in input.splitlines()]
print(sum([g.gid for g in games if g.r<=12 and g.g<=13 and g.b<=14]))
print(sum([g.r*g.g*g.b for g in games]))